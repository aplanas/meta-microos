SUMMARY = "Persistent lexical variable values for arbitrary calls."
DESCRIPTION = "Lexical::Persistence does a few things, all related. Note that all the \
behaviors listed here are the defaults. Subclasses can override nearly \
every aspect of Lexical::Persistence's behavior. \
 \
Lexical::Persistence lets your code access persistent data through lexical \
variables. This example prints 'some value' because the value of $x \
persists in the $lp object between setter() and getter(). \
 \
	use Lexical::Persistence; \
 \
	my $lp = Lexical::Persistence->new(); \
	$lp->call(\\&setter); \
	$lp->call(\\&getter); \
 \
	sub setter { my $x = 'some value' } \
	sub getter { print my $x, '\\n' } \
 \
Lexicals with leading underscores are not persistent. \
 \
By default, Lexical::Persistence supports accessing data from multiple \
sources through the use of variable prefixes. The set_context() member sets \
each data source. It takes a prefix name and a hash of key/value pairs. By \
default, the keys must have sigils representing their variable types. \
 \
	use Lexical::Persistence; \
 \
	my $lp = Lexical::Persistence->new(); \
	$lp->set_context( pi => { '$member' => 3.141 } ); \
	$lp->set_context( e => { '@member' => [ 2, '.', 7, 1, 8 ] } ); \
	$lp->set_context( \
		animal => { \
			'%member' => { cat => 'meow', dog => 'woof' } \
		} \
	); \
 \
	$lp->call(\\&display); \
 \
	sub display { \
		my ($pi_member, @e_member, %animal_member); \
 \
		print 'pi = $pi_member\\n'; \
		print 'e = @e_member\\n'; \
		while (my ($animal, $sound) = each %animal_member) { \
			print 'The $animal goes... $sound!\\n'; \
		} \
	} \
 \
And the corresponding output: \
 \
	pi = 3.141 \
	e = 2 . 7 1 8 \
	The cat goes... meow! \
	The dog goes... woof! \
 \
By default, call() takes a single subroutine reference and an optional list \
of named arguments. The arguments will be passed directly to the called \
subroutine, but Lexical::Persistence also makes the values available from \
the 'arg' prefix. \
 \
	use Lexical::Persistence; \
 \
	my %animals = ( \
		snake => 'hiss', \
		plane => 'I'm Cartesian', \
	); \
 \
	my $lp = Lexical::Persistence->new(); \
	while (my ($animal, $sound) = each %animals) { \
		$lp->call(\\&display, animal => $animal, sound => $sound); \
	} \
 \
	sub display { \
		my ($arg_animal, $arg_sound); \
		print 'The $arg_animal goes... $arg_sound!\\n'; \
	} \
 \
And the corresponding output: \
 \
	The plane goes... I'm Cartesian! \
	The snake goes... hiss! \
 \
Sometimes you want to call functions normally. The wrap() method will wrap \
your function in a small thunk that does the call() for you, returning a \
coderef. \
 \
	use Lexical::Persistence; \
 \
	my $lp = Lexical::Persistence->new(); \
	my $thunk = $lp->wrap(\\&display); \
 \
	$thunk->(animal => 'squirrel', sound => 'nuts'); \
 \
	sub display { \
		my ($arg_animal, $arg_sound); \
		print 'The $arg_animal goes... $arg_sound!\\n'; \
	} \
 \
And the corresponding output: \
 \
	The squirrel goes... nuts! \
 \
Prefixes are the characters leading up to the first underscore in a lexical \
variable's name. However, there's also a default context named underscore. \
It's literally '_' because the underscore is not legal in a context name by \
default. Variables without prefixes, or with prefixes that have not been \
previously defined by set_context(), are stored in that context. \
 \
The get_context() member returns a hash for a named context. This allows \
your code to manipulate the values within a persistent context. \
 \
	use Lexical::Persistence; \
 \
	my $lp = Lexical::Persistence->new(); \
	$lp->set_context( \
		_ => { \
			'@mind' => [qw(My mind is going. I can feel it.)] \
		} \
	); \
 \
	while (1) { \
		$lp->call(\\&display); \
		my $mind = $lp->get_context('_')->{'@mind'}; \
		splice @$mind, rand(@$mind), 1; \
		last unless @$mind; \
	} \
 \
	sub display { \
		my @mind; \
		print '@mind\\n'; \
	} \
 \
Displays something like: \
 \
	My mind is going. I can feel it. \
	My is going. I can feel it. \
	My is going. I feel it. \
	My going. I feel it. \
	My going. I feel \
	My I feel \
	My I \
	My \
 \
It's possible to create multiple Lexical::Persistence objects, each with a \
unique state. \
 \
	use Lexical::Persistence; \
 \
	my $lp_1 = Lexical::Persistence->new(); \
	$lp_1->set_context( _ => { '$foo' => 'context 1's foo' } ); \
 \
	my $lp_2 = Lexical::Persistence->new(); \
	$lp_2->set_context( _ => { '$foo' => 'the foo in context 2' } ); \
 \
	$lp_1->call(\\&display); \
	$lp_2->call(\\&display); \
 \
	sub display { \
		print my $foo, '\\n'; \
	} \
 \
Gets you this output: \
 \
	context 1's foo \
	the foo in context 2 \
 \
You can also compile and execute perl code contained in plain strings in a \
a lexical environment that already contains the persisted variables. \
 \
	use Lexical::Persistence; \
 \
	my $lp = Lexical::Persistence->new(); \
 \
	$lp->do( 'my $message = 'Hello, world' ); \
 \
	$lp->do( 'print '$message\\n'' ); \
 \
Which gives the output: \
 \
	Hello, world \
 \
If you come up with other fun uses, let us know."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "1.023"

RPM_NAME = "perl-Lexical-Persistence-1.023-3.26.noarch.rpm"
RPM_HASH = "b191484fdcd58c04b7a6000a1d68abafeae98ef779d4cd0c76694c46895d7059c71d0db956cfcb82d9d88d8f13757a4dfb3a99eeba2abd983ea91770010dd37c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Lexical::Persistence) \
perl-Lexical-Persistence"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Devel::LexAlias) \
perl(PadWalker)"

inherit rpm

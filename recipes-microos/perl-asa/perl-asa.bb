SUMMARY = "Lets your class/object say it works like something else"
DESCRIPTION = "Perl 5 doesn't natively support Java-style interfaces, and it doesn't \
support Perl 6 style roles either. \
 \
You can get both of these things in half a dozen different ways via various \
CPAN modules, but they usually require that you buy into 'their way' of \
implementing your code. \
 \
Other have turned to 'duck typing'. \
 \
This is, for the most part, a fairly naive check that says 'can you do this \
method', under the 'if it looks like a duck, and quacks like a duck, then \
it must be a duck'. \
 \
It assumes that if you have a '->quack' method, then they will treat you as \
a duck, because doing things like adding 'Duck' to your '@ISA' array means \
you are also forced to take their implementation. \
 \
There is, of course, a better way. \
 \
For better or worse, Perl's '->isa' functionality to determine if something \
is or is not a particular class/object is defined as a *method*, not a \
function, and so that means that as well as adding something to you '@ISA' \
array, so that Perl's 'UNIVERSAL::isa' method can work with it, you are \
also allowed to simply overload your own 'isa' method and answer directly \
whether or not you are something. \
 \
The simplest form of the idiom looks like this. \
 \
  sub isa { \
      return 1 if $_[1] eq 'Duck'; \
      shift->SUPER::isa(@_); \
  } \
 \
This reads 'Check my type as normal, but if anyone wants to know if I'm a \
duck, then tell them yes'. \
 \
Now, there are a few people that have argued that this is 'lying' about \
your class, but this argument is based on the idea that '@ISA' is somehow \
more 'real' than using the method directly. \
 \
It also assumes that what you advertise you implement needs to be in sync \
with the method resolution for any given function. But in the best and \
cleanest implementation of code, the API is orthogonal (although most often \
related) to the implementation. \
 \
And although '@ISA' is about implementation *and* API, overloading 'isa' to \
let you change your API is not at all bad when seen in this light."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.04"

RPM_NAME = "perl-asa-1.04-1.15.noarch.rpm"
RPM_HASH = "fd797c29add357225ccafe47b6e07ff679d54bab3531c1acf9feef7e5ab871e18b545000efe1b307b5d6bd7043df580153c802dd7cddda74ba93daada628e56d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(asa) perl-asa"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

SUMMARY = "Method and Function Declarations with Signatures and No Source Filter"
DESCRIPTION = "Provides two new keywords, 'func' and 'method', so that you can write \
subroutines with signatures instead of having to spell out 'my $self = \
shift; my($thing) = @_' \
 \
'func' is like 'sub' but takes a signature where the prototype would \
normally go. This takes the place of 'my($foo, $bar) = @_' and does a whole \
lot more. \
 \
'method' is like 'func' but specifically for making methods. It will \
automatically provide the invocant as '$self' (by default). No more 'my \
$self = shift'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "20170211"

RPM_NAME = "perl-Method-Signatures-20170211-1.21.noarch.rpm"
RPM_HASH = "03f7a7bee9e5a3073b52fa1a9ab0e5a7416a7afee83489cd612e091bf5ae61ff0572b7b05359a334781880d55b35e12fec584880b298e2cb51c46bd2c267819e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Method::Signatures) perl(Method::Signatures::Modifiers) perl(Method::Signatures::Parameter) perl(Method::Signatures::Signature) perl(Method::Signatures::Types) perl(Method::Signatures::Utils) perl-Method-Signatures"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) perl(Any::Moose) perl(Const::Fast) perl(Devel::Declare) perl(Devel::Declare::MethodInstaller::Simple) perl(Lexical::SealRequireHints) perl(Mouse) perl(PPI) perl(Sub::Name)"

inherit rpm

SUMMARY = "Run code after a subroutine call, preserving the context the subroutine [cut]"
DESCRIPTION = "Sometimes you need to call a function, get the results, act on the results, \
then return the result of the function. This is painful because of \
contexts; the original function can behave different if it's called in \
void, scalar, or list context. You can ignore the various cases and just \
pick one, but that's fragile. To do things right, you need to see which \
case you're being called in, and then call the function in that context. \
This results in 3 code paths, which is a pain to type in (and maintain). \
 \
This module automates the process. You provide a coderef that is the \
'original function', and another coderef to run after the original runs. \
You can modify the return value (aliased to @_) here, and do whatever else \
you need to do. 'wantarray' is correct inside both coderefs; in 'after', \
though, the return value is ignored and the value 'wantarray' returns is \
related to the context that the original function was called in."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.03"

RPM_NAME = "perl-Context-Preserve-0.03-1.20.noarch.rpm"
RPM_HASH = "834b65d308cede4a39546e79bcf038f7134ed7ca760ed17105d219345173d6cd45c2604a1c948bf3933fb4f30088b472e8baa511f57f33a617951ea3ad59d853"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Context::Preserve) perl-Context-Preserve"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

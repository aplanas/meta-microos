SUMMARY = "Lexically-Scoped Resource Management"
DESCRIPTION = "This module provides a convenient way to perform cleanup or other forms of \
resource management at the end of a scope. It is particularly useful when \
dealing with exceptions: the 'Scope::Guard' constructor takes a reference \
to a subroutine that is guaranteed to be called even if the thread of \
execution is aborted prematurely. This effectively allows lexically-scoped \
'promises' to be made that are automatically honoured by perl's garbage \
collector. \
 \
For more information, see: the http://www.drdobbs.com/cpp/184403758 manpage"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.21"

RPM_NAME = "perl-Scope-Guard-0.21-1.26.noarch.rpm"
RPM_HASH = "4916d59db083702693495afb1624e320fcd683e2ac9dccc0febd8532e80be24dc0452fdd5b748bcba61ecbe1d76a292fc2b935827ca07fd7207e8cb9144fa3d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Scope::Guard) \
perl-Scope-Guard"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

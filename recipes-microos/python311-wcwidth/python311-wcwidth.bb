SUMMARY = "Number of Terminal column cells of wide-character codes"
DESCRIPTION = "This API is mainly for Terminal Emulator implementors -- any python \
program that attempts to determine the printable width of a string on \
a Terminal. It is implemented in python (no C library calls) and has \
no 3rd-party dependencies. \
 \
It is certainly possible to use your Operating System's wcwidth(3) \
and wcswidth(3) calls if it is POSIX-conforming, but this would not \
be possible on non-POSIX platforms, such as Windows, or for \
alternative Python implementations, such as jython.  It is also \
commonly many releases older than the most current Unicode Standard \
release files, which this project aims to track."
LICENSE = "MIT"

PV = "0.2.6"

RPM_NAME = "python311-wcwidth-0.2.6-2.1.noarch.rpm"
RPM_HASH = "669681ac25370224386666eeda7b78fff683306c03d12be1aef6cb4708039186318929fcbe2284c648ac2842bc96a489d5798f2355c6c759776026140606dd86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(wcwidth) python311-wcwidth python3dist(wcwidth)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

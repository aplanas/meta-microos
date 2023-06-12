SUMMARY = "IO::Socket with read/write timeout"
DESCRIPTION = "'IO::Socket' provides a way to set a timeout on the socket, but the timeout \
will be used only for connection, not for reading / writing operations. \
 \
This module provides a way to set a timeout on read / write operations on \
an 'IO::Socket' instance, or any 'IO::Socket::*' modules, like \
'IO::Socket::INET'."
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.32"

RPM_NAME = "perl-IO-Socket-Timeout-0.32-1.23.noarch.rpm"
RPM_HASH = "5bca6bae4242cd77b5d81123b9f523c174bb81504b15647afaa0026975015321468bd09c516027cfcd5e0d256ae7cb10ad82a418e5b55cbb6c734c9578343fcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(IO::Socket::Timeout) \
perl(IO::Socket::Timeout::Role::PerlIO) \
perl(IO::Socket::Timeout::Role::SetSockOpt) \
perl-IO-Socket-Timeout"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(PerlIO::via::Timeout)"

inherit rpm

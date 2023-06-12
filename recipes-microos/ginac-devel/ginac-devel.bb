SUMMARY = "GiNaC development libraries and header files"
DESCRIPTION = "GiNaC (which stands for 'GiNaC is Not a CAS (Computer Algebra System)') is an \
open framework for symbolic computation within the C++ programming language. \
 \
This package contains the libraries, include files and other resources you \
use to develop GiNaC applications."
LICENSE = "GPL-2.0-only"

PV = "1.8.5"

RPM_NAME = "ginac-devel-1.8.5-2.3.aarch64.rpm"
RPM_HASH = "0dba51952cbd1be3539ba14dba27252df1082bd2cb683732d547f7171994b24e60a4b045c5df285763f02097ee218a5f104c12f489e1ddce0bacb5d2bc4db3f0"

RPROVIDES:${PN} += "cmake(ginac) \
ginac-devel \
ginac-devel(aarch-64) \
libginac-devel \
pkgconfig(ginac)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
cln-devel \
libginac11 \
pkgconfig(cln)"

inherit rpm

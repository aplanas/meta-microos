SUMMARY = "Windows Portable Runtime development files"
DESCRIPTION = "This package contains header files for developing applications that \
use the winpr and winpr-tools libraries."
LICENSE = "Apache-2.0"

PV = "2.10.0"

RPM_NAME = "winpr-devel-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "c1886f73d3cb695fd400c9b892012c33964af4147474863a5fac2ec2e9639042f70d3fc667625b84e07d3cb94254423d17bb9d351c9d72b450ae8d82ca4ce071"

RPROVIDES:${PN} += "cmake(WinPR) libwinpr2-devel pkgconfig(winpr-tools2) pkgconfig(winpr2) winpr-devel winpr-devel(aarch-64)"
RDEPENDS:${PN} += "/usr/bin/pkg-config cmake libwinpr2-2 pkgconfig(libssl) pkgconfig(winpr2)"

inherit rpm

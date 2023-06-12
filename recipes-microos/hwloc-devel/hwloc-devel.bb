SUMMARY = "Headers and shared development libraries for hwloc"
DESCRIPTION = "This package contains the headers and shared object symbolic links \
for the hwloc."
LICENSE = "BSD-3-Clause"

PV = "2.9.0"

RPM_NAME = "hwloc-devel-2.9.0-3.1.aarch64.rpm"
RPM_HASH = "14470165c02aeb4243f1ff035785b21822d03e60a16cfa422237ab9e13d7e65cb82a2467092981c6d62ce7f0c1761b3293fcf11b277886d4a3340b47c8a53f48"

RPROVIDES:${PN} += "hwloc-devel hwloc-devel(aarch-64) libhwloc-devel pkgconfig(hwloc)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libhwloc15 pkgconfig(libxml-2.0) pkgconfig(pciaccess)"

inherit rpm

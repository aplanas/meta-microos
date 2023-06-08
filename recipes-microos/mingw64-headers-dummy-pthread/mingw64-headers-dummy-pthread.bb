SUMMARY = "Stub pthread header files for MinGW"
DESCRIPTION = "This subpackage contains stub pthread header files that are empty \
and only exist to satisfy dependencies in MinGW's unistd.h until \
an actual pthread implementation (like winpthreads) is installed."
LICENSE = "SUSE-Public-Domain"

PV = "10.0.0"

RPM_NAME = "mingw64-headers-dummy-pthread-10.0.0-1.3.noarch.rpm"
RPM_HASH = "ba576b26be1db2f76ea625321ee6c2eba1d3a77bbf12ac54376d9623a0141ba4848560fc40654616aad0bb314cc6be5a79a1ab6a723d93c0c9e57178df56b750"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-headers-dummy-pthread mingw64-unistd-pthread-devel"
RDEPENDS:${PN} += ""

inherit rpm

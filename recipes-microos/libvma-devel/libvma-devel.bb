SUMMARY = "Header files and link required to develop with Libvma"
DESCRIPTION = "Headers and symbolink link required to compile and link with the Libvma library."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "9.7.0"

RPM_NAME = "libvma-devel-9.7.0-2.1.aarch64.rpm"
RPM_HASH = "a464507c4638b0ddf512bfd7ba6f85bb2bbefb06f08f755fd7f5080ebf9e123f0a550eb77e84784e73277c96f0968f27e5bd749f575c2f49e72b5fb54da0a7a7"

RPROVIDES:${PN} += "libvma-devel \
libvma-devel(aarch-64)"
RDEPENDS:${PN} += "libvma9"

inherit rpm

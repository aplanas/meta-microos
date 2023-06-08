SUMMARY = "Include files for libtpms"
DESCRIPTION = "Libtpms header files and documentation."
LICENSE = "BSD-3-Clause"

PV = "0.9.6"

RPM_NAME = "libtpms-devel-0.9.6-1.3.aarch64.rpm"
RPM_HASH = "90bed7de21ce77bf93ba7a44cf0562ecc46eb4a5625c0ef681830cbe1bfd548a0ed01fd43576184679c19fe5b884b7033660a79991135bcb8baff79faa3db7aa"

RPROVIDES:${PN} += "libtpms-devel libtpms-devel(aarch-64) pkgconfig(libtpms)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libopenssl-devel libtpms0 mozilla-nspr-devel"

inherit rpm

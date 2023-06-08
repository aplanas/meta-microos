SUMMARY = "Real-time strategy gaming engine development files"
DESCRIPTION = "These are the development files for Wyrmsun which is based on the Stratagus engine."
LICENSE = "GPL-2.0-only"

PV = "5.3.6"

RPM_NAME = "wyrmgus-devel-5.3.6-2.4.aarch64.rpm"
RPM_HASH = "931b5859f5885f518bba940b21c1534fac38dbd7660fd3fcc646f6c43af7c74db1f576e5bb8436e51db1b448a4ecd955ec14d6bb937ef1b483fb2786304392d5"

RPROVIDES:${PN} += "wyrmgus-devel wyrmgus-devel(aarch-64)"
RDEPENDS:${PN} += "wyrmgus"

inherit rpm

SUMMARY = "Library for Working with GIF Images - Files Mandatory for Development"
DESCRIPTION = "This Library allows manipulating GIF Image files. Since the LZW patents \
have expired, giflib can again be used instead of libungif."
LICENSE = "MIT"

PV = "5.2.1"

RPM_NAME = "giflib-devel-5.2.1-3.3.aarch64.rpm"
RPM_HASH = "cea664f5137f4b9516eb724ee2c3aaf2ef00ccdbcd9c702faf4ed5ea68a1fcead555609d78773d4938fe94222444e597aaf12e57476eb51cc64e0bf6acb01baa"

RPROVIDES:${PN} += "giflib-devel giflib-devel(aarch-64)"
RDEPENDS:${PN} += "libgif7"

inherit rpm

SUMMARY = "Bytestructures for Guile"
DESCRIPTION = "This library offers a system imitating the type system of the C programming \
language, to be used on bytevectors within Guile."
LICENSE = "GPL-3.0-only"

PV = "1.0.9"

RPM_NAME = "guile-bytestructures-1.0.9-1.8.aarch64.rpm"
RPM_HASH = "c7cc5a99e30942b0be8b9401afcf3fafe6b85bef4161fadabf9706caed084934c2e0efea9c2b030bbee0784174d3adf7a3a4ac91ce69d50577299286385a9ecf"

RPROVIDES:${PN} += "guile-bytestructures guile-bytestructures(aarch-64)"
RDEPENDS:${PN} += "guile"

inherit rpm

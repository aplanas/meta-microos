SUMMARY = "GNU Modula-2 compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Modula-2 language."
LICENSE = "BSL-1.0"

PV = "13.0.1+git7231"

RPM_NAME = "libm2min18-13.0.1+git7231-1.1.aarch64.rpm"
RPM_HASH = "4c88b30c8128842605b1d0457706203381bc5cb2f910751f646d73e07bc3e650ad771f8313768058e95fe048ceefcffec0aec3bd742b16793e526b2134513f61"

RPROVIDES:${PN} += "libm2min.so.18()(64bit) libm2min18 libm2min18(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm

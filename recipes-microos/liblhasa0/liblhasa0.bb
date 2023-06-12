SUMMARY = "A decompression library for the LHARC data format"
DESCRIPTION = "liblhasa is the backend to the Lhasa tool, offering decompressing for \
'.lzh' (LHA/LHarc) and '.lzs' (LArc) archives."
LICENSE = "ISC"

PV = "0.4.0"

RPM_NAME = "liblhasa0-0.4.0-1.1.aarch64.rpm"
RPM_HASH = "0ed42b319c4076957fb155aa0a94101fc578814e843681294ad63096a72e311d3d5a0d24879acaf1031bbf8dc1a8ae8f1a7bc14fc47cff0de92ae97fc09848f3"

RPROVIDES:${PN} += "liblhasa.so.0()(64bit) liblhasa0 liblhasa0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.33)(64bit)"

inherit rpm

SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python310-libsmraw-20230320-1.3.aarch64.rpm"
RPM_HASH = "e96ca4f06469518c43ae4753a8d109a97d214d7968ef95f83a2eb3fb85528382a36d980a4c8bafef83708490cee7187abcd393c868bdee6ba4e715a182d50cbc"

RPROVIDES:${PN} += "python3-libsmraw \
python310-libsmraw \
python310-libsmraw(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libsmraw.so.1()(64bit) \
libsmraw.so.1(V_20230320)(64bit) \
python(abi)"

inherit rpm

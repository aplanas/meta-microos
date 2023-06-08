SUMMARY = "Library and tools to access Microsoft PFF/OFF/PST/OST/PAB files"
DESCRIPTION = "libpff is a library to access the Personal Folder File (PFF) and the \
Offline Folder File (OFF) format. These are used in several file \
Types: PAB (Personal Address Book), PST (Personal Storage Table) and \
OST (Offline Storage Table)."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20230325"

RPM_NAME = "python311-libpff-20230325-1.4.aarch64.rpm"
RPM_HASH = "a5e26ba87a21060a8adb4340af0476ed2bcd79633578c687c6a3a188bf45ae67b09ecb4db4b3f6896b56a533b1ff0f91ea395faf96cd623456a94a6a3f9a50b2"

RPROVIDES:${PN} += "python311-libpff python311-libpff(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libpff.so.1()(64bit) libpff.so.1(V_20230325)(64bit) python(abi)"

inherit rpm

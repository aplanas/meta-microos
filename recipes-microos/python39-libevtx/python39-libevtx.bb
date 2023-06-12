SUMMARY = "Library and tools to access the Windows XML Event Log (EVTX) format"
DESCRIPTION = "Library and tools to access the Windows XML Event Log (EVTX) format. \
For the Windows pre-XML Event Log (EVT) format, see libevt."
LICENSE = "GFDL-1.3-only & LGPL-3.0-or-later"

PV = "20221101"

RPM_NAME = "python39-libevtx-20221101-3.10.aarch64.rpm"
RPM_HASH = "5094618cd27877940567d1f391989ef9ebb18317e023f9a4fdc31a3a09cfd39c987c0f388559066cbb4eeb5c89c6c2bddac34032ed6d8d5e96d206f5689950b2"

RPROVIDES:${PN} += "python39-libevtx \
python39-libevtx(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libclocale.so.1()(64bit) \
libclocale.so.1(V_20221218)(64bit) \
libevtx.so.1()(64bit) \
libevtx.so.1(V_20221101)(64bit) \
python(abi)"

inherit rpm

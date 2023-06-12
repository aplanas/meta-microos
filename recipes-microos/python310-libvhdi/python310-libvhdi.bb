SUMMARY = "Library and tools to access the VHD image format"
DESCRIPTION = "Library and tools to access the Virtual Hard Disk (VHD) image format. \
 \
Read-supported formats: \
 \
* VHD version 1 \
 \
Supported image types: \
 \
* Fixed-size hard disk image \
* Dynamic-size (or sparse) hard disk image \
* Differential (or differencing) hard disk image \
* Note that an undo disk image (.vud) is also a differential image"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "python310-libvhdi-20221124-3.7.aarch64.rpm"
RPM_HASH = "0433c5146b241c82688c47a7ff74bed8e5663b3e06f1c729e32bc0d3bb325bbd7a8bf0de70254ff50d731dbd9b68ca0607444090fcce9b4eba8c665404b78649"

RPROVIDES:${PN} += "python3-libvhdi \
python310-libvhdi \
python310-libvhdi(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libfguid.so.1()(64bit) \
libfguid.so.1(V_20220113)(64bit) \
libvhdi.so.1()(64bit) \
libvhdi.so.1(V_20221124)(64bit) \
python(abi)"

inherit rpm

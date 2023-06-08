SUMMARY = "Library to access the VMDK image format"
DESCRIPTION = "The libvmdk library is a library to access the VMware Virtual Disk (VMDK) format. \
 \
Read supported extent file formats: \
 \
* RAW (flat) \
* COWD version 1 (sparse) \
* VMDK version 1, 2 and 3 (sparse) \
 \
Supported VMDK format features: \
 \
* delta links \
* grain compression \
* data markers \
 \
VMDK format features not supported at the moment: \
 \
* images that use a physical device \
* changed block tracking (CBT) (supported by VMDK version 3 (sparse)) / change tracking files"
LICENSE = "LGPL-3.0-or-later"

PV = "20221124"

RPM_NAME = "libvmdk1-20221124-3.7.aarch64.rpm"
RPM_HASH = "dddbbdbc805e317b99991595b3348e325c2beca97ce77fd861594593a76287208e036104c9b97fc93aa1da1d7f9e3de199450e66ee0bd7e80df6499d1986b56e"

RPROVIDES:${PN} += "libvmdk.so.1()(64bit) libvmdk.so.1(V_20221124)(64bit) libvmdk1 libvmdk1(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbfio.so.1()(64bit) libbfio.so.1(V_20221025)(64bit) libc.so.6(GLIBC_2.17)(64bit) libcdata.so.1()(64bit) libcdata.so.1(V_20230108)(64bit) libcerror.so.1()(64bit) libcerror.so.1(V_20220101)(64bit) libcfile.so.1()(64bit) libcfile.so.1(V_20220106)(64bit) libclocale.so.1()(64bit) libclocale.so.1(V_20221218)(64bit) libcnotify.so.1()(64bit) libcnotify.so.1(V_20220108)(64bit) libcpath.so.1()(64bit) libcpath.so.1(V_20220108)(64bit) libcsplit.so.1()(64bit) libcsplit.so.1(V_20220109)(64bit) libcthreads.so.1()(64bit) libcthreads.so.1(V_20220102)(64bit) libfcache.so.1()(64bit) libfcache.so.1(V_20230115)(64bit) libfdata.so.1()(64bit) libfdata.so.1(V_20230319)(64bit) libfvalue.so.1()(64bit) libfvalue.so.1(V_20220120)(64bit) libuna.so.1()(64bit) libuna.so.1(V_20220611)(64bit) libz.so.1()(64bit)"

inherit rpm

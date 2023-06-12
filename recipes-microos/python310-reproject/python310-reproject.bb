SUMMARY = "Reproject astronomical images"
DESCRIPTION = "Reproject astronomical images"
LICENSE = "BSD-3-Clause"

PV = "0.9.1"

RPM_NAME = "python310-reproject-0.9.1-1.5.aarch64.rpm"
RPM_HASH = "24aaaaa5e075944c7b15e28d23a009ca3024d33b00ac891d347798c8c785ee6ca3e43f494dfd21396f5f751af7ad2fe2a0b836095691e5dc98671e3dd30b8833"

RPROVIDES:${PN} += "python3-reproject \
python3.10dist(reproject) \
python310-reproject \
python310-reproject(aarch-64) \
python3dist(reproject)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
python(abi) \
python310-astropy \
python310-astropy-healpix \
python310-numpy \
python310-scipy"

inherit rpm

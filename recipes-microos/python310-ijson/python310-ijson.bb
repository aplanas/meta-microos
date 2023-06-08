SUMMARY = "Iterative JSON parser with a standard Python iterator interface"
DESCRIPTION = "Iterative JSON parser with a standard Python iterator interface."
LICENSE = "BSD-3-Clause"

PV = "3.1.4"

RPM_NAME = "python310-ijson-3.1.4-1.11.aarch64.rpm"
RPM_HASH = "89999f7f27822f67ad21969d1ab895dc132b5bbddb7c71c6a1be21f01d983a72b0a382fa9412c0cebcb55f8c6540d6802ca9ac931e22108bb08ee57054bda9df"

RPROVIDES:${PN} += "python3-ijson python3.10dist(ijson) python310-ijson python310-ijson(aarch-64) python3dist(ijson)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libyajl.so.2()(64bit) python(abi)"

inherit rpm

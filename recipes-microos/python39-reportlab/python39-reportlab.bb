SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python39-reportlab-3.6.12-2.4.aarch64.rpm"
RPM_HASH = "dc29a1782ddae687c304c8fc80295cfd133bd931ee11a922c54f973737df6401d712ef569d0f9001c5b37c4cad6fe0149d099f2a51e4b59df148a186eeb6a9ab"

RPROVIDES:${PN} += "python3.9dist(reportlab) python39-ReportLab python39-reportlab python39-reportlab(aarch-64) python3dist(reportlab)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfreetype.so.6()(64bit) python(abi) python39-Pillow"

inherit rpm

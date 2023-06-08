SUMMARY = "The Reportlab Toolkit"
DESCRIPTION = "The ReportLab Toolkit. An Open Source Python library for generating PDFs and graphics."
LICENSE = "BSD-3-Clause"

PV = "3.6.12"

RPM_NAME = "python310-reportlab-3.6.12-2.4.aarch64.rpm"
RPM_HASH = "214e8f6d8ec25ae8928a0af8eb6f6c78e34aef8881feb80b1e5629a4ced685ddf307881e2b0fbd1834228099c3780a480c5ba4a6582b0efbe935e8fd4ff7e73d"

RPROVIDES:${PN} += "python3-ReportLab python3-reportlab python3.10dist(reportlab) python310-ReportLab python310-reportlab python310-reportlab(aarch-64) python3dist(reportlab)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.17)(64bit) libfreetype.so.6()(64bit) python(abi) python310-Pillow"

inherit rpm

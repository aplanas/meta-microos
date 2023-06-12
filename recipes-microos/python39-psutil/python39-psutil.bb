SUMMARY = "A process utilities module for Python"
DESCRIPTION = "A graphical interface that lets you easily analyze and introspect unaltered running Python processes."
LICENSE = "BSD-3-Clause"

PV = "5.9.5"

RPM_NAME = "python39-psutil-5.9.5-1.1.aarch64.rpm"
RPM_HASH = "aa7a5a346a95e4f34685e5bc8497937649cbb91417160a767a09c6e2801558afd27218301173e2c6e34c7a0b7ea0cfa5ad23348cac362dbaa642001cb9afa56c"

RPROVIDES:${PN} += "python3.9dist(psutil) \
python39-psutil \
python39-psutil(aarch-64) \
python3dist(psutil)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
procps \
python(abi)"

inherit rpm

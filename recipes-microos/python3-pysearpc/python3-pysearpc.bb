SUMMARY = "Python files for libsearpc"
DESCRIPTION = "The python-pysearpc package contains python files to make use of libsearpc."
LICENSE = "Apache-2.0"

PV = "3.3.0.20230224"

RPM_NAME = "python3-pysearpc-3.3.0.20230224-1.1.aarch64.rpm"
RPM_HASH = "be701fb8c63e86f4cbb3f9285248374e4e1d927b1b36ee23a1fa6f6d29208dddc218928baf7f3ff1f8b55f565eaa2d415173724d6c7d9aef526480bdeb6271b0"

RPROVIDES:${PN} += "python3-pysearpc \
python3-pysearpc(aarch-64)"
RDEPENDS:${PN} += "libsearpc1 \
python(abi)"

inherit rpm

SUMMARY = "Python module for determining Unicode text segmentations"
DESCRIPTION = "A pure Python module to determine Unicode text segmentations."
LICENSE = "MIT"

PV = "0.7.2"

RPM_NAME = "python39-uniseg-0.7.2-1.2.noarch.rpm"
RPM_HASH = "f0ed7f762261e18deb7ea926442606dbf08d0870c460dbfd323c1b43e115e5d58a63dd1e6b868c3951b6fb5b3c1d9d98ba0b8212f7ebd97a040e01c5908d65ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(uniseg) \
python39-uniseg \
python3dist(uniseg)"
RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm

SUMMARY = "Data-Driven/Decorated Tests"
DESCRIPTION = "A library to multiply test cases."
LICENSE = "MIT"

PV = "1.6.0"

RPM_NAME = "python310-ddt-1.6.0-3.1.noarch.rpm"
RPM_HASH = "70375b78824fedcdec32d63794093639f1a13132ca58089103f3f6914fcaa100abd53939cf61d72570e006a5daad58b04190f1aba1fb473d62b9f11f7f6d53f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ddt \
python3.10dist(ddt) \
python310-ddt \
python3dist(ddt)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

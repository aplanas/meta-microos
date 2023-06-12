SUMMARY = "Configuration file loader"
DESCRIPTION = "derpconf abstracts loading configuration files for your app."
LICENSE = "MIT"

PV = "0.8.3"

RPM_NAME = "python39-derpconf-0.8.3-2.1.noarch.rpm"
RPM_HASH = "2a9157d7051b3cb5376c55155fb7fba053272e2f4b0c888e4c745aa159df5aa04e2af405c0f82017179ca2d03bb53d1c5e7bf083af262d208e6e985d3867ee7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(derpconf) \
python39-derpconf \
python3dist(derpconf)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

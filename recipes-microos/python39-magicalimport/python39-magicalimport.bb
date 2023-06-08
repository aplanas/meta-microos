SUMMARY = "Importing Python modules by physical file path"
DESCRIPTION = "Importing Python modules by physical file path."
LICENSE = "MIT"

PV = "0.9.1"

RPM_NAME = "python39-magicalimport-0.9.1-2.8.noarch.rpm"
RPM_HASH = "12dd32e8147a13d9fcac6ef208e8ededcfd1c613554529120d1bd7247adf8c627d69be8884e4ef5dae2cd3af97eeb4dab39e27d089b5ff6e2a009e993be42599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(magicalimport) python39-magicalimport python3dist(magicalimport)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

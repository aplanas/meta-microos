SUMMARY = "Django settings using TOML configuration files"
DESCRIPTION = "Django settings using TOML configuration files."
LICENSE = "Apache-2.0"

PV = "0.0.4"

RPM_NAME = "python39-django-settings-toml-0.0.4-1.13.noarch.rpm"
RPM_HASH = "3fff350af141f05de5777382452fd695a29c504ff58cdf905204baf3468777ed7462bbe2cdb4c33621096b8c1c55602b0f7134b8f0a686b0d1a880f9f54d249b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(django-settings-toml) python39-django-settings-toml python3dist(django-settings-toml)"
RDEPENDS:${PN} += "python(abi) python39-toml"

inherit rpm

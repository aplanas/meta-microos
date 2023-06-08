SUMMARY = "Data loading and cataloging system"
DESCRIPTION = "A plugin system for loading your data and making data catalogs."
LICENSE = "BSD-2-Clause"

PV = "0.6.8"

RPM_NAME = "python39-intake-0.6.8-1.1.noarch.rpm"
RPM_HASH = "5139d34d21815b3875de8abe2af9f537b8848bae74b4bfa46fcb7f1292c565fea1edde4a2cff31b70e9cb1c8263f9a2c56e6663c1e5987eb2f7feac7fcb02a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(intake) python39-intake python3dist(intake)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/python3.9 python(abi) python39-Jinja2 python39-PyYAML python39-appdirs python39-dask python39-dask-bag python39-entrypoints python39-fsspec python39-msgpack update-alternatives"

inherit rpm

SUMMARY = "Persistent dict in Python backed by sqlite3"
DESCRIPTION = "A wrapper around Python's sqlite3 database with a Pythonic \
dict-like interface and support for multi-thread access."
LICENSE = "Apache-2.0"

PV = "1.6.0"

RPM_NAME = "python39-sqlitedict-1.6.0-3.12.noarch.rpm"
RPM_HASH = "a64c2f3ae83b0c53030488ba4ba8ce2cab13157d9c988c7fdc165bbd8a7b01fe077ab77ffd19b0fe96e03d0b575105be21f14c1c476d6a3e96d6c80e3ab2dff5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(sqlitedict) \
python39-sqlitedict \
python3dist(sqlitedict)"
RDEPENDS:${PN} += "python(abi) \
python39"

inherit rpm

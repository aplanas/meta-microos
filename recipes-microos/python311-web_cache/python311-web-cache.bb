SUMMARY = "Persistent cache storage python module"
DESCRIPTION = "Python module for simple key-value storage backed up by sqlite3 \
database. The typical use case is a URL to HTTP data cache, but it can \
also be used fo non web resources. It features different cache eviction \
strategies and optional compression."
LICENSE = "LGPL-2.1-only"

PV = "1.1.0"

RPM_NAME = "python311-web_cache-1.1.0-3.12.noarch.rpm"
RPM_HASH = "b18e2a5c71e453ce35c08728079db0e183030cf7cbcfed8d3aa741e6648b60e28c70597d49d4d742fa4577b5573846ef127868f9036e20d44f30440564d586f4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(web-cache) \
python311-web_cache \
python3dist(web-cache)"
RDEPENDS:${PN} += "python(abi) \
python311"

inherit rpm

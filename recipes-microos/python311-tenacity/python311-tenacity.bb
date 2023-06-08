SUMMARY = "Python module for retrying code until it succeeeds"
DESCRIPTION = "Tenacity is a general-purpose retrying library, written in Python, to simplify \
the task of adding retry behavior to just about anything. \
It originates from a fork of `Retrying`_ \
Features \
-------- \
- Generic Decorator API \
- Specify stop condition (i.e. limit by number of attempts) \
- Specify wait condition (i.e. exponential backoff sleeping between attempts) \
- Customize retrying on Exceptions \
- Customize retrying on expected returned result"
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python311-tenacity-8.1.0-1.3.noarch.rpm"
RPM_HASH = "077011fcaf5ad9ecd5ad5ca3a486cf3433389a888bbedf86067e24be6ff015baac2149e8acfd218384eea52a949119ec55c038ebde64c004de1747c0f0c94770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(tenacity) python311-tenacity python3dist(tenacity)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

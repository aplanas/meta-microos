SUMMARY = "Ordered YAML loader and dumper for PyYAML"
DESCRIPTION = "This module provides loaders and dumpers for PyYAML. Currently, an \
OrderedDict loader/dumper is implemented, allowing to keep items order \
when loading resp. dumping a file from/to an OrderedDict (Python 3.7: \
Also regular dicts are supported and are the default items to be loaded \
to. As of Python 3.7 preservation of insertion order is a language \
feature of regular dicts.) \
 \
[API Documentation](https://phynix.github.io/yamlloader/index.html)."
LICENSE = "MIT"

PV = "1.2.2"

RPM_NAME = "python310-yamlloader-1.2.2-1.3.noarch.rpm"
RPM_HASH = "d703a677c3876cff2474ae57833b49a74335205190c9f9c2e5aa99daf3c67f83f0528b94762a645887e89911fcf74d6249cb79bebd584f5496eb2922b2d313be"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamlloader python3.10dist(yamlloader) python310-yamlloader python3dist(yamlloader)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

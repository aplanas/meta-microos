SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "16.6.0"

RPM_NAME = "python39-path-16.6.0-2.1.noarch.rpm"
RPM_HASH = "69bab889002aebbd1ba0be16560d0d185140858b2e8be0927ee329e1701fb15abd40130f7de1dd115146390540c976f5b271c6be4287d2d0c660e559bac6976f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(path) \
python39-path \
python39-path.py \
python3dist(path)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

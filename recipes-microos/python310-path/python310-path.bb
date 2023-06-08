SUMMARY = "A module wrapper for os.path"
DESCRIPTION = "The path package implements a path objects as first-class \
entities, allowing common operations on files to be invoked \
on those path objects directly."
LICENSE = "MIT"

PV = "16.6.0"

RPM_NAME = "python310-path-16.6.0-2.1.noarch.rpm"
RPM_HASH = "4383f9bcd5dc8ba563d9b1607721852388053aaecb34a8329b00e02c0efced063c0ed38935508bd969e7fc7d3c67c89e40b6e11534e6f35936a753a014548ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-path python3-path.py python3.10dist(path) python310-path python310-path.py python3dist(path)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

SUMMARY = "Abseil Python Common Libraries"
DESCRIPTION = "This package is a collection of Python library code for building Python \
applications. The code is collected from Google's own Python code base, and has \
been extensively tested and used in production. \
* Simple application startup \
* Distributed commandline flags system \
* Custom logging module with additional features \
* Testing utilities"
LICENSE = "Apache-2.0"

PV = "1.4.0"

RPM_NAME = "python39-abseil-1.4.0-1.1.noarch.rpm"
RPM_HASH = "039b4c5dc527b8b0cc4b349dacafb6939105be7c86b86fdf9af03a00f472028b10767b3083f5a97cb8115396f39503222b69b96525bdaffc4aecd1860e1e7c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(absl-py) \
python39-abseil \
python39-absl-py \
python3dist(absl-py)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm

SUMMARY = "The scikit_build_core[pyproject] extra"
DESCRIPTION = "Python CMake adaptor and Python API for plugins: The extra requirement to build PEP518 wheels and sdists"
LICENSE = "Apache-2.0"

PV = "0.2.2"

RPM_NAME = "python310-scikit-build-core-pyproject-0.2.2-1.1.noarch.rpm"
RPM_HASH = "84c9bc49529dcb71fa74fdf1d14b62fa69004a6b61ad83f2495868e3716dff439e88ba5b808382659544e4f15b466b2dba0ce04a1fe7cb08870b864d56d7c7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-scikit-build-core-pyproject python3-scikit_build_core-pyproject python310-scikit-build-core-pyproject python310-scikit_build_core-pyproject"
RDEPENDS:${PN} += "python310-distlib python310-pathspec python310-pyproject-metadata python310-scikit-build-core"

inherit rpm

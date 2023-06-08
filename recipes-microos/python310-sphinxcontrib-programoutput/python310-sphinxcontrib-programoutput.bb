SUMMARY = "Sphinx extension to include program output"
DESCRIPTION = "A Sphinx extension to literally insert the output of arbitrary commands into \
documents, helping you to keep your command examples up to date."
LICENSE = "BSD-2-Clause"

PV = "0.17"

RPM_NAME = "python310-sphinxcontrib-programoutput-0.17-2.8.noarch.rpm"
RPM_HASH = "137ae94941ceaa3ae82988beadc0836bc5a54935211f6c54717a92a1c5ef159780461b49c7675b3e5f2cda1b916bd750eb0ab019dece2f877d428bd9a97ab320"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-programoutput python3.10dist(sphinxcontrib-programoutput) python310-sphinxcontrib-programoutput python3dist(sphinxcontrib-programoutput)"
RDEPENDS:${PN} += "python(abi) python310-Sphinx"

inherit rpm

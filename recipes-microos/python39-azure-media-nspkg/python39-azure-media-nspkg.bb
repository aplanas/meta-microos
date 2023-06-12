SUMMARY = "Microsoft Azure Media Namespace Package"
DESCRIPTION = "This is the Microsoft Azure Media namespace package. \
 \
This package is not intended to be installed directly by the end user. \
 \
It provides the necessary files for other packages to extend the azure.media namespace."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python39-azure-media-nspkg-1.0.0-1.10.noarch.rpm"
RPM_HASH = "3f054e052a16b0a2b778c22331b522204e089554c54f180b15db571f2d46b079f0209e6e50d37cb2e80891f35d816f3bb3fd4ce13f6bfad3db6a8cbe4222bde0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(azure-media-nspkg) \
python39-azure-media-nspkg \
python3dist(azure-media-nspkg)"
RDEPENDS:${PN} += "python(abi) \
python39-azure-nspkg"

inherit rpm

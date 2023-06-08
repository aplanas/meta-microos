SUMMARY = "Python bindings for FFmpeg"
DESCRIPTION = "Python bindings for FFmpeg - with complex filtering support"
LICENSE = "Apache-2.0"

PV = "0.2.0"

RPM_NAME = "python310-ffmpeg-python-0.2.0-6.4.noarch.rpm"
RPM_HASH = "d0bfd76679a16e36cbc884e872cc1b294af1b77eddc57d0350df49d1e00e0ad00291944c4af7e4db1ece8a197d2f3b8b0387ba018af8ce23819192d765ac8517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ffmpeg-python python3.10dist(ffmpeg-python) python310-ffmpeg-python python3dist(ffmpeg-python)"
RDEPENDS:${PN} += "python(abi) python310-future"

inherit rpm

SUMMARY = "Audio signal processing library"
DESCRIPTION = "This is a python audio signal processing library."
LICENSE = "MIT"

PV = "0.6.0"

RPM_NAME = "python310-zignal-0.6.0-5.4.noarch.rpm"
RPM_HASH = "3cb9322cdd1c7f5b6cca8619200bcbca3a0e18f06ac221131a1688bf32171799978b219042801b1277599aacaea5aa50e2563bf2dce7b1efbe069064a4cff42e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-zignal \
python3.10dist(zignal) \
python310-zignal \
python3dist(zignal)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-matplotlib \
python310-numpy \
python310-samplerate \
python310-scipy \
update-alternatives"

inherit rpm

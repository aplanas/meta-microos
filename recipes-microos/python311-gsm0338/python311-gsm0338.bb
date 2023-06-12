SUMMARY = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38"
DESCRIPTION = "Python Codec for 3GPP TS 23.038 / ETSI GSM 03.38. \
The codec implements the encoding and decoding methods in the \
stateless codecs.Codec class. With loading the module the \
codec get's automatically registered."
LICENSE = "MIT"

PV = "1.0.0"

RPM_NAME = "python311-gsm0338-1.0.0-2.3.noarch.rpm"
RPM_HASH = "0ceed03830732b3075015c33dc8da194ba4da110d5804bed83e0225ef91db2dc82214f88868eda8745a6110b210a05c091d0f10e009e36ef1c3b0b7f367ff7a2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(gsm0338) \
python311-gsm0338 \
python3dist(gsm0338)"
RDEPENDS:${PN} += "python(abi) \
python311-six"

inherit rpm

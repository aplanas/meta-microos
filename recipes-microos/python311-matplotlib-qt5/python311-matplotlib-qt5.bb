SUMMARY = "Qt5 backend for python311-matplotlib"
DESCRIPTION = "This package includes the Qt5-based pyqt5 backend \
for the python311-matplotlib plotting package"
LICENSE = "SUSE-Matplotlib"

PV = "3.6.3"

RPM_NAME = "python311-matplotlib-qt5-3.6.3-2.1.aarch64.rpm"
RPM_HASH = "e17e4a26addc01d714c8b835b7ac4153c461fd8e53ac477b3daab0b39cd8670c7768b66870fea3fa0acf063a2d4e5fe842c15180a48004ca8c78d0bbad4634a6"

RPROVIDES:${PN} += "python311-matplotlib-qt-shared \
python311-matplotlib-qt5 \
python311-matplotlib-qt5(aarch-64)"
RDEPENDS:${PN} += "python(abi) \
python311-matplotlib \
python311-qt5"

inherit rpm

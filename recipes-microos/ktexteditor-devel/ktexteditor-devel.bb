SUMMARY = "Header files for ktexteditor, an embeddable text editor component"
DESCRIPTION = "KTextEditor provides a text editor component that can be embedded in \
applications, either as a KPart or using the KF5::TextEditor library. \
 \
This subpackage provides the header files."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "ktexteditor-devel-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "719172f2b64c898a543e2df68c410f385a968db004e62d8e1db6e50f6d561e9f90ee97539e6bb3726aea5f194e81d80231cc0bbff482b704eed57da9811e6222"

RPROVIDES:${PN} += "cmake(KF5TextEditor) ktexteditor-devel ktexteditor-devel(aarch-64)"
RDEPENDS:${PN} += "cmake(KF5Parts) cmake(KF5SyntaxHighlighting) extra-cmake-modules ktexteditor"

inherit rpm

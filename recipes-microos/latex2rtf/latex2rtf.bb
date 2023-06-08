SUMMARY = "LaTeX to RTF Converter"
DESCRIPTION = "LaTeX2RTF is a translator program to convert LaTeX formatted text files into \
“rich text format” (RTF) files. RTF is a published standard format by Microsoft. \
This standard can be ambiguous in places, but RTF is supported by many text \
editors. Specifically, it is supported by Microsoft Word. This means that the \
conversion of a LaTeX document to RTF allows anyone with a copy of Word to \
ponvert LaTeX files to Word .doc or .docx files."
LICENSE = "GPL-2.0-or-later"

PV = "2.3.18a"

RPM_NAME = "latex2rtf-2.3.18a-1.11.aarch64.rpm"
RPM_HASH = "16130ce8a3386b2d2d0455d5a2eb7c019e9ae025750a99fd7fb7107e63eed6fa4792b48d52f2b4ed75065e5e0d2a9546dcf9996bf3e70c721940d4df6ddb3b52"

RPROVIDES:${PN} += "latex2rtf latex2rtf(aarch-64)"
RDEPENDS:${PN} += "/bin/bash /bin/sh ImageMagick libc.so.6(GLIBC_2.34)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) netpbm texlive-scheme-basic"

inherit rpm

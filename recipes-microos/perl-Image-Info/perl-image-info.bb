SUMMARY = "Extract meta information from image files"
DESCRIPTION = "This module provides functions to extract various kinds of meta information \
from image files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.43"

RPM_NAME = "perl-Image-Info-1.43-1.2.noarch.rpm"
RPM_HASH = "0c0f8ae60300350edbfbf303fe9a362a30098ac37336be7e16bdb9d141d447a9d9df9a6c1a2c14f9172bbe27b63501e9c3825a0b6443b6bf6a7490f98e91559f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Bundle::Image::Info::Everything) \
perl(Bundle::Image::Info::PNG) \
perl(Bundle::Image::Info::SVG) \
perl(Bundle::Image::Info::XBM) \
perl(Bundle::Image::Info::XPM) \
perl(Image::Info) \
perl(Image::Info::BMP) \
perl(Image::Info::GIF) \
perl(Image::Info::ICO) \
perl(Image::Info::JPEG) \
perl(Image::Info::PNG) \
perl(Image::Info::PPM) \
perl(Image::Info::Result) \
perl(Image::Info::SVG) \
perl(Image::Info::SVG::XMLLibXMLReader) \
perl(Image::Info::SVG::XMLSimple) \
perl(Image::Info::TIFF) \
perl(Image::Info::WBMP) \
perl(Image::Info::WEBP) \
perl(Image::Info::XBM) \
perl(Image::Info::XPM) \
perl(Image::TIFF) \
perl(Image::TIFF::Rational) \
perl-Image-Info"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0)"

inherit rpm

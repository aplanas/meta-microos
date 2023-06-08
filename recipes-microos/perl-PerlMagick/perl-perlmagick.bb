SUMMARY = "Perl interface for ImageMagick"
DESCRIPTION = "PerlMagick is an objected-oriented Perl interface to ImageMagick. Use \
the module to read, manipulate, or write an image or image sequence \
from within a Perl script. This makes it suitable for Web CGI scripts."
LICENSE = "ImageMagick"

PV = "7.1.1.8"

RPM_NAME = "perl-PerlMagick-7.1.1.8-1.1.aarch64.rpm"
RPM_HASH = "e67a3a375490391a1eb06f000aa211d772be4827d3d5581febf373bd1254ab008d0bcc459884f12d219b7a25788b1be6e1c44777fcf770c5aeda339357ad653d"

RPROVIDES:${PN} += "perl(Image::Magick) perl(Image::Magick::Q16HDRI) perl-PerlMagick perl-PerlMagick(aarch-64)"
RDEPENDS:${PN} += "ImageMagick ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libMagickCore-7.Q16HDRI.so.10()(64bit) libMagickCore-7_Q16HDRI10 libc.so.6(GLIBC_2.17)(64bit) libm.so.6()(64bit) libm.so.6(GLIBC_2.17)(64bit) perl"

inherit rpm

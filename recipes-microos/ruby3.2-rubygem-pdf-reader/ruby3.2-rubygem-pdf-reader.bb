SUMMARY = "A library for accessing the content of PDF files"
DESCRIPTION = "The PDF::Reader library implements a PDF parser conforming as much as possible \
to the PDF specification from Adobe."
LICENSE = "MIT"

PV = "2.11.0"

RPM_NAME = "ruby3.2-rubygem-pdf-reader-2.11.0-1.6.aarch64.rpm"
RPM_HASH = "edc8e9d5c3c4a4acc05948a21e97c050b17a25676494c3287ddd3f3fd0105c72eaebb7d738ff0afdf9f3a5719e09ed16ac38490018848a5adb70efb277a0b5f8"

RPROVIDES:${PN} += "ruby3.2-rubygem-pdf-reader ruby3.2-rubygem-pdf-reader(aarch-64) rubygem(pdf-reader) rubygem(ruby:3.2.0:pdf-reader) rubygem(ruby:3.2.0:pdf-reader:2) rubygem(ruby:3.2.0:pdf-reader:2.11) rubygem(ruby:3.2.0:pdf-reader:2.11.0)"
RDEPENDS:${PN} += "/bin/sh /usr/bin/ruby.ruby3.2 ruby(abi) rubygem(ruby:3.2.0:Ascii85:1) rubygem(ruby:3.2.0:afm:0.2) rubygem(ruby:3.2.0:hashery:2) rubygem(ruby:3.2.0:ruby-rc4) rubygem(ruby:3.2.0:ttfunk) update-alternatives"

inherit rpm

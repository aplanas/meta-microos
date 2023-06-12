SUMMARY = "OAuth 1.0 for Perl"
DESCRIPTION = "OAuth 1.0 for Perl"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.28"

RPM_NAME = "perl-Net-OAuth-0.28-5.25.noarch.rpm"
RPM_HASH = "bb2204bb54cbaa36f2a87878ae009c26f4104cca563a0fe8f7d567f6024fc9655a76f045e7a5238c4d0107062783cd537bb8adf3c8a85d7d541afcbd24cc6055"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "perl(Net::OAuth) \
perl(Net::OAuth::AccessToken) \
perl(Net::OAuth::AccessTokenRequest) \
perl(Net::OAuth::AccessTokenResponse) \
perl(Net::OAuth::Client) \
perl(Net::OAuth::ConsumerRequest) \
perl(Net::OAuth::Message) \
perl(Net::OAuth::ProtectedResourceRequest) \
perl(Net::OAuth::Request) \
perl(Net::OAuth::RequestTokenRequest) \
perl(Net::OAuth::RequestTokenResponse) \
perl(Net::OAuth::Response) \
perl(Net::OAuth::SignatureMethod::HMAC_SHA1) \
perl(Net::OAuth::SignatureMethod::HMAC_SHA256) \
perl(Net::OAuth::SignatureMethod::PLAINTEXT) \
perl(Net::OAuth::SignatureMethod::RSA_SHA1) \
perl(Net::OAuth::UserAuthRequest) \
perl(Net::OAuth::UserAuthResponse) \
perl(Net::OAuth::V1_0A::AccessTokenRequest) \
perl(Net::OAuth::V1_0A::RequestTokenRequest) \
perl(Net::OAuth::V1_0A::RequestTokenResponse) \
perl(Net::OAuth::V1_0A::UserAuthResponse) \
perl(Net::OAuth::XauthAccessTokenRequest) \
perl(Net::OAuth::YahooAccessTokenRefreshRequest) \
perl-Net-OAuth"
RDEPENDS:${PN} += "perl(:MODULE_COMPAT_5.36.0) \
perl(Class::Accessor) \
perl(Class::Data::Inheritable) \
perl(Digest::HMAC_SHA1) \
perl(Digest::SHA) \
perl(Digest::SHA1) \
perl(Encode) \
perl(LWP::UserAgent) \
perl(URI::Escape)"

inherit rpm

package org.odk.collect.android.openrosa.api;

import java.util.List;

public interface FormListApi {

    List<FormListItem> fetchFormList() throws FormApiException;

    ManifestFile fetchManifest(String manifestURL) throws FormApiException;
}

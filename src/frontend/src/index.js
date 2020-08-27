import UIStrings from './constants/UIStrings';
import DownloadReport from './components/DownloadReport/DownloadReport';
import ReportRepositoryList from './components/RepositoryList/ReportRepositoryList';

window.plugins.push({
  id: 'nexus-report-plugin',

  features: [
    {
      mode: 'browse',
      path: '/report',
      text: UIStrings.REPORT_FORM.MENU.text,
      description: UIStrings.REPORT_FORM.MENU.description,
      view: ReportRepositoryList,
      authenticationRequired: false,
      iconCls: 'x-fa fa-user',
      visibility: {
        bundle: 'org.sonatype.nexus.plugins.nexus-report-plugin',
        permissions: ['nexus:report:export']
      }
    }
  ]
});

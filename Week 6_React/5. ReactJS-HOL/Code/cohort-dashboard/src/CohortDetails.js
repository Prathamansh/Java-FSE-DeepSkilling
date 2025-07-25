import React from 'react';
import styles from './CohortDetails.module.css';

function CohortDetails({ cohort }) {
  const titleStyle = {
    color: cohort.status === 'Ongoing' ? 'green' : 'blue',
    textDecoration: 'underline',
    fontWeight: 'bold',
    cursor: 'pointer'
  };

  return (
    <div className={styles.box}>
      <h4 style={titleStyle}>{cohort.name}</h4>
      <dl>
        <dt>Started On</dt>
        <dd>{cohort.startDate}</dd>
        <dt>Current Status</dt>
        <dd>{cohort.status}</dd>
        <dt>Coach</dt>
        <dd>{cohort.coach}</dd>
        <dt>Trainer</dt>
        <dd>{cohort.trainer}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
